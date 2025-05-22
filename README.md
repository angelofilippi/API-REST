## 🔑API REST🔑

## 📖Este repositóiro é para afins de pratica e estudos📖

## Requisições adicionadas até agora:

# GET:

![image](https://github.com/user-attachments/assets/da26ece2-b390-425e-8c91-f67b5a924441)

Utilizando as anotações do SpringBoot mapeamos a request e a função "getAll()" vai chamar o repository que se comunica com o JPA trazendo um model com as informações até o controller retortando uma lista de produtos (CASO O STATUS DA REQUISIÇÃO SEJA O 200). Caso a requisição GET não ache nenhum produto, foi criado uma condicional que verifica se a lista de produtos é vazia e a tratação:

![image](https://github.com/user-attachments/assets/5fb91fc3-f70e-4455-9c5d-52ecb6214450)

Sera retornado o status 404 NOT FOUND.
