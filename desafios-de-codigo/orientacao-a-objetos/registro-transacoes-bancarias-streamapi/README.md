# Registro de Transações Bancárias
## Instruções
Você está aprimorando o programa anterior e agora deseja utilizar a Stream API do Java para processar as transações bancárias de forma mais eficiente.

## Entrada:
O programa solicitará ao usuário que informe o saldo inicial da conta.
Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

Entrada de Transações:
Para cada transação, o programa solicitará ao usuário:
O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
O valor da transação.

## Saída:
Utilizando a Stream API, o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.

## Exemplos:
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 100<br>2<br>d<br>10<br>s<br>20 | Saldo: 90.0<br>Transações:<br>d de 10.0<br>s de 20.0 |
| 5000<br>1<br>d<br>500 | Saldo: 5500.0<br>Transações:<br>d de 500.0 |

