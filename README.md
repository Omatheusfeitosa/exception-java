# Projeto de Tratamento de Exceções em Java

Este projeto demonstra o uso de tratamento de exceções em Java em um contexto de reserva de quartos, utilizando conceitos de boas práticas de programação e encapsulamento de erros.

## 📋 Funcionalidades

- **Cadastrar Reserva:** Permite criar uma reserva informando o número do quarto, data de check-in e data de check-out.
- **Atualizar Reserva:** Permite atualizar as datas de check-in e check-out de uma reserva existente.
- **Validação de Dados:** 
  - Garante que a data de check-out seja posterior à de check-in.
  - Impede que reservas sejam feitas para datas no passado.
  - Lida com formatos de data inválidos.

## 🛠️ Estrutura do Projeto

- **`Program`**: Classe principal responsável por interagir com o usuário via entrada de dados e exibir mensagens.
- **`Reservation`**: Classe que encapsula os dados de uma reserva, como número do quarto, datas de check-in e check-out, e implementa a lógica de validação.
- **`DomainException`**: Classe personalizada para tratar exceções específicas relacionadas às regras de negócio da reserva.

## 🚀 Como Executar

1. **Pré-requisitos**:
   - Java Development Kit (JDK) 8 ou superior.
   - Um ambiente de desenvolvimento como Eclipse, IntelliJ IDEA ou terminal com suporte a Java.

2. **Passos**:
   - Compile o código:
     ```bash
     javac application/Program.java
     ```
   - Execute o programa:
     ```bash
     java application.Program
     ```

## 🧪 Exemplos de Uso

- Criar uma reserva:

Room Number: 101 Check-in date (DD/MM/YYYY): 20/12/2024 Check-out date (DD/MM/YYYY): 25/12/2024 Reservation: Room: 101, Checkin: 20/12/2024, Checkout: 25/12/2024, 5 Nights
  
- Atualizar uma reserva:

  Enter the data to update the reservation Check-in date (DD/MM/YYYY): 21/12/2024 Check-out date (DD/MM/YYYY): 26/12/2024 Reservation: Room: 101, Checkin: 21/12/2024, Checkout: 26/12/2024, 5 Nights

- Tentativa de reserva inválida:

Room Number: 102 Check-in date (DD/MM/YYYY): 15/12/2024 Check-out date (DD/MM/YYYY): 14/12/2024 Error in reservation: Check-out date must be after check-in date

## 📂 Estrutura de Arquivos

src/ 
├── application/ │ 
    └── Program.java # Classe principal do programa 
├── model/ │ 
    ├── entities/
      │ └── Reservation.java # Classe que representa uma reserva 
      │ └── exceptions/
      │ └── DomainException.java # Exceção personalizada


