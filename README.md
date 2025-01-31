Tecnologias Utilizadas:

    Spring Boot (para o backend)
    Spring Data JPA (para integração com o banco de dados)
    SQL Server (banco de dados)
    Gradle (gerenciador de dependências e build)
    JUnit (para testes)

Configurar o Projeto:
    Clone este repositório para sua máquina local
    Configurar o Banco de Dados:
       Configurar a conexão com o banco de dados: Edite o arquivo src/main/resources/application.properties com suas credenciais do SQL Server
    Instalar as Dependências:
        gradle build
    Run:
        gradle bootRun
    URL:
        http://localhost:8080

ENDPOINTS:
    1. Listar Todos os Produtos
    GET /api/products
    Retorna uma lista de todos os produtos.
    2. Listar Produtos por Categoria
    GET /api/products/category/{categoryId}
    Retorna todos os produtos de uma categoria específica.
    3. Pesquisar Produtos por Nome
    GET /api/products/search?name={productName}
    Retorna uma lista de produtos cujo nome foi inserido
    4. Criar Novo Produto
    POST /api/products 
    Cria um novo produto.

Testes:
    gradle test

Licença
    Este projeto está licenciado sob a MIT License.


