# Sistema de Gestão para Consultório Odontológico

## Descrição do Projeto
Este é um software desktop desenvolvido em **Java** para a gestão de um consultório odontológico, permitindo o cadastro de pacientes, agendamento de consultas e controle financeiro. O sistema utiliza **MySQL** como banco de dados para armazenar as informações.

## Funcionalidades
- **Cadastro de Pacientes**: Nome, telefone, e-mail, endereço e histórico médico.
- **Agendamento de Consultas**: Data, horário, profissional responsável e status da consulta.
- **Controle Financeiro**: Registro de pagamentos e geração de relatórios financeiros.
- **Gerenciamento de Usuários**: Níveis de acesso para secretárias, dentistas e administradores.
- **Notificações**: Envio de lembretes automáticos por e-mail.

## Tecnologias Utilizadas
- **Linguagem**: Java (JDK 17+)
- **Interface Gráfica**: Swing
- **Banco de Dados**: MySQL

[//]: # (- **ORM**: Hibernate &#40;para manipulação do banco de dados&#41;)

[//]: # (- **Bibliotecas Auxiliares**: JasperReports &#40;Relatórios&#41;, JavaMail &#40;Notificações por e-mail&#41;)

## Requisitos
Antes de iniciar o projeto, certifique-se de ter os seguintes requisitos instalados:
- **JDK 17 ou superior**
- **MySQL Server**
- **MySQL Workbench** (opcional, para administrar o banco de dados)

[//]: # (- **Maven** &#40;para gerenciar dependências&#41;)

## Configuração do Banco de Dados
1. Instale o MySQL e crie um banco de dados:
   ```sql
   CREATE DATABASE consultorio_db;
   ```
2. Execute o seguinte script para criar as tabelas necessárias:
   ```sql
   USE consultorio_db;
   
   CREATE TABLE pacientes (
       id INT PRIMARY KEY AUTO_INCREMENT,
       nome VARCHAR(100) NOT NULL,
       telefone VARCHAR(15),
       email VARCHAR(100),
       endereco TEXT,
       historico_medico TEXT
   );
   
   CREATE TABLE consultas (
       id INT PRIMARY KEY AUTO_INCREMENT,
       paciente_id INT,
       data_consulta DATETIME,
       profissional VARCHAR(100),
       status ENUM('Agendado', 'Concluído', 'Cancelado'),
       FOREIGN KEY (paciente_id) REFERENCES pacientes(id)
   );
   ```
3. Configure o arquivo `hibernate.cfg.xml` no projeto para conectar ao banco de dados:
   ```xml
   <hibernate-configuration>
       <session-factory>
           <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
           <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/consultorio_db</property>
           <property name="hibernate.connection.username">seu_usuario</property>
           <property name="hibernate.connection.password">sua_senha</property>
           <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
           <property name="hibernate.show_sql">true</property>
           <property name="hibernate.hbm2ddl.auto">update</property>
       </session-factory>
   </hibernate-configuration>
   ```

## Como Executar o Projeto
1. Clone o repositório:
   ```sh
   git clone https://github.com/seuusuario/consultorio-odontologico.git
   cd consultorio-odontologico
   ```
2. Compile o projeto com Maven:
   ```sh
   mvn clean install
   ```
3. Execute a aplicação:
   ```sh
   mvn exec:java -Dexec.mainClass="com.consultorio.Main"
   ```

## Telas do Sistema
(Tela de login, tela de cadastro de pacientes, tela de agendamento de consultas - Adicione capturas de tela aqui se desejar.)

## Melhorias Futuras
- Integração com WhatsApp para notificações.
- Versão web responsiva.
- Relatórios financeiros avançados.

## Contato
Caso tenha dúvidas ou sugestões, entre em contato:
- **E-mail:** contato@consultorio.com
- **LinkedIn:** [linkedin.com/in/seuperfil](https://linkedin.com/in/seuperfil)

---

**Licença:** Este projeto está licenciado sob a MIT License. Sinta-se à vontade para contribuir!

