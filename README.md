<h2>Digital Innovation One: Bootcamp Code Anywhere Avanade<br>Projeto: Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>


Projeto desenvolvimento com instruções de [Rodrigo Peleias](https://github.com/rpeleias) na trilha de estudo do Bootcamp Code Anywhere da [Digital Innovation One](https://digitalinnovation.one/).

Link da base utilizada: [rpeleias/personapi_digital_innovation_one](https://github.com/rpeleias/personapi_digital_innovation_one)

Publicado no Cloud da [Heroku](https://www.heroku.com/).

Versões utilizadas:

* Java 11.0.11
* Maven 3.6.3
* Intellj IDEA Community Edition 2021.1.3

Um agradecimento especial para a [Avanade](https://www.avanade.com/pt-br) e a todos os instrutores do Bootcamp Code Anywhere que compartilharam suas experiências.

Para realizar GET, POST, PUT e DELETE, é recomendado utilizar o [Postman](https://www.postman.com/).

Abaixo seguem exemplos para fazer POST para cadastro de Cidade, Bairro e Pessoa com telefone(s) e endereço(s):

---

- Cadastro de Cidade:

- - http://people-didi.herokuapp.com/api/v1/city

  - `{"city": "São Paulo", "state": "SP"}`

    

- Cadastro de Bairro:

- - http://people-didi.herokuapp.com/api/v1/district

  - `{"district": "Centro", "idCity": "1"}`

    

- Cadastro de Pessoa com telefone(s) e endereço(s):

- - http://people-didi.herokuapp.com/api/v1/people
  - `{"firstName": "Maria", "lastName": "Silva", "cpf": "006.111.600-99", "birthDate": "15-03-1990",`
    	`"phones": [`
            `{"type": "HOME","number": "(11) 99999998"},`
    		`  {"type": "MOBILE","number": "(11)888888888"}`
        	`],`
    	`"addresses": [`
    		`{"addressType": "COMMERCIAL","streetType": "AVENUE","street": "Intranet","number": "68","idDistrict": "3"},`
    		`{"addressType": "MAILING","streetType": "BYSTREET","street": "da Net","number": "234","idDistrict": "2"}`
    	`]`
    `}`

----

Para consultar os cadastros já feitos basta acessar os links:

- Cidades: http://people-didi.herokuapp.com/api/v1/city

- Bairros: http://people-didi.herokuapp.com/api/v1/district

- Pessoas: http://people-didi.herokuapp.com/api/v1/people

----

Para visualizar um cadastro em específico (GET), atualizar (PUT) ou deletar (DELETE), é necessário informar o id do cadastro após o endereço do API, exemplo:

DELETE `http://people-didi.herokuapp.com/api/v1/people/1`
