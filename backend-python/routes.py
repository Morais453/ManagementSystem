from flask import Blueprint, request, jsonify
from models import db, Patient, Appointment, FinancialRecord

bp = Blueprint('api', __name__)

@bp.route('/patients', methods=['POST'])
def add_patient():
    data = request.get_json()
    new_patient = Patient(
        name=data['name'],
        phone=data['phone'],
        email=data['email'],
        address=data['address'],
        medical_history=data.get('medical_history', '')
    )
    db.session.add(new_patient)
    db.session.commit()
    return jsonify({'message': 'Patient added successfully!'}), 201

@bp.route('/appointments', methods=['POST'])
def schedule_appointment():
    data = request.get_json()
    new_appointment = Appointment(
        patient_id=data['patient_id'],
        date=data['date'],
        time=data['time'],
        professional=data['professional'],
        status=data['status']
    )
    db.session.add(new_appointment)
    db.session.commit()
    return jsonify({'message': 'Appointment scheduled successfully!'}), 201

@bp.route('/patients', methods=['GET'])
def get_patients():
    patients = Patient.query.all()
    return jsonify([{'id': patient.id, 'name': patient.name, 'phone': patient.phone, 'email': patient.email, 'address': patient.address} for patient in patients]), 200

@bp.route('/financial', methods=['POST'])
def add_financial_record():
    data = request.get_json()
    new_record = FinancialRecord(
        patient_id=data['patient_id'],
        amount=data['amount'],
        date=data['date'],
        description=data.get('description', '')
    )
    db.session.add(new_record)
    db.session.commit()
    return jsonify({'message': 'Financial record added successfully!'}), 201
