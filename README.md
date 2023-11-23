# dslist
### Projeto feito a partir do intensivão Java Spring Boot 2sem/2023
O projeto teve como intuito um breve ensinamento do mundo do Java Spring Boot e Backend geral
O projeto teve configurações de validação até o deploy ativo para subir em algum sistema de aplicação de nuvem como por exemplo Railway ou Heroku

Modelo de domínio DSList
![dslist-model](https://github.com/Guilherme-W8/dslist/assets/99774034/69a782fa-b537-4bf5-bc72-5460c11e13a0)

Na foto podemos observar o modelo ao qual baseamos a aplicação. É um projeto totalmente voltado ao backend, não temos interface de frontend, portanto caso queira verificar as requisições da aplicação, use o Postman.

# Como rodar o projeto?
### Primeiro passo: Clonar o projeto pelo git/github
<ul><strong>command:</strong> git clone git@github.com:Guilherme-W8/dslist.git</ul>

### Segundo passo: Rodar o projeto em um ambiente  <a href="https://spring.io/tools">STS</a>
<ul><strong>No navegador, após rodar o projeto em um ambiente STS: </strong>http://localhost:8080/</ul>

# Acessando o Postman

### Requisições configuradas no <a href="https://www.postman.com/">Postman</a>
<ul>
   <li>GET retorna os games com o padrão DTO: http://localhost:8080/games</li>
   <li>GET retorna um game específico a partir do ID: http://localhost:8080/games/7</li>
   <li>GET retorna a lista dos tipos de categorias disponíveis: http://localhost:8080/lists</li>
   <li>GET retorna os jogos que estão em determinada lista: http://localhost:8080/lists/1/games</li>
</ul>

<i>Agradecimentos ao professor Nélio Alves e a sua empresa <a href="https://devsuperior.com.br/">DevSuperior</a></i>
