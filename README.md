# Sistema de Gestão para Consultório Odontológico

## Descrição do Projeto
Este é um software web desenvolvido em **Python** para a gestão de um consultório odontológico, permitindo o cadastro de pacientes, agendamento de consultas e controle financeiro. O sistema utiliza **MySQL** como banco de dados para armazenar as informações.

## Funcionalidades
- **Cadastro de Pacientes**: Nome, telefone, e-mail, endereço e histórico médico.
- **Agendamento de Consultas**: Data, horário, profissional responsável e status da consulta.
- **Controle Financeiro**: Registro de pagamentos e geração de relatórios financeiros.
- **Gerenciamento de Usuários**: Níveis de acesso para secretárias, dentistas e administradores.


## Tecnologias Utilizadas
- **Linguagem**: Python  (3.12+)
- **Interface Gráfica**: ...
- **Banco de Dados**: MySQL

## Requisitos
Antes de iniciar o projeto, certifique-se de ter os seguintes requisitos instalados:
- **Python 3.12**
- **MySQL Server**
- **MySQL Workbench** (opcional, para administrar o banco de dados)


## Telas do Sistema
(Tela de login, tela de cadastro de pacientes, tela de agendamento de consultas - Adicione capturas de tela aqui se desejar.)

## Instalação
Para instalar e executar o projeto, siga os passos abaixo:

1. Crie um ambiente virtual:
   ```bash
   python3 -m venv venv
   ```
2. Ative o ambiente virtual:
   - No Windows:
     ```bash
     venv\Scripts\activate
     ```
   - No macOS/Linux:
     ```bash
     source venv/bin/activate
     ```
3. Clone o repositório.
4. Navegue até o diretório `backend-python`.
5. Instale os pacotes necessários usando o comando:
   ```bash
   pip install -r requirements.txt
   ```
6. Configure o banco de dados MySQL e atualize os detalhes de conexão em `config.py`.
7. Execute a aplicação com o comando:
   ```bash
   python app.py
   ```


## Melhorias Futuras
- Notificações envio de lembretes automáticos por e-mail.
- Integração com WhatsApp para notificações.
- Versão web responsiva.
- Relatórios financeiros avançados.

## Contato
Caso tenha dúvidas ou sugestões, entre em contato:
- **LinkedIn:** [linkedin.com/in/danilomorais453/](https://www.linkedin.com/in/danilomorais453/)

---

**Licença:** Este projeto está licenciado sob a MIT License. Sinta-se à vontade para contribuir!
