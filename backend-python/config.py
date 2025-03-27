import os

class Config:
    SQLALCHEMY_DATABASE_URI = os.environ.get('DATABASE_URL') or 'mysql://new_user:new_password@localhost/new_db_name'
    SQLALCHEMY_TRACK_MODIFICATIONS = False
