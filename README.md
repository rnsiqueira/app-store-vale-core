# App Store Vale Core

**App Store Vale Core** é um projeto backend desenvolvido em **Java 21**, construído com **Spring Boot** e projetado para ser altamente adaptável a ambientes de nuvem. Ele fornece uma base robusta para aplicações RESTful com segurança integrada, suporte a migrações de banco de dados e configuração para deploy em ambiente serverless utilizando o **Google Cloud Run**.

## 📃 Visão Geral

O objetivo deste projeto é oferecer uma infraestrutura backend moderna com as melhores práticas de arquitetura, segura, escalável e flexível. A aplicação foi inicialmente configurada com **MongoDB**, mas está preparada para uso com **PostgreSQL**, com scripts de migração Flyway já incluídos.

## 🪧 Funcionalidades

* Autenticação e autorização com **Spring Security**
* APIs RESTful com **Spring Web**
* Persistência com **JPA** (com suporte a MongoDB e PostgreSQL)
* Migrações de banco com **Flyway**
* Contêners com **Docker**
* Deploy para **Google Cloud Run**

## 📁 Estrutura do Projeto

* `src/main/java` – Código-fonte principal da aplicação
* `src/main/resources` – Arquivos de configuração (application.yml, migrations, etc)
* `Dockerfile` – Imagem para containerização da aplicação
* `flyway-database-postgresql` – Scripts SQL para versões do PostgreSQL

## 🚀 Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3+**
* **Spring Security**
* **Spring Web**
* **Spring Data JPA**
* **MongoDB** (configuração padrão)
* **PostgreSQL** (opcional com Flyway)
* **Flyway** para migrações
* **Docker**
* **Google Cloud Platform (Cloud Run)**

## 🚩 Como Executar Localmente

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/rnsiqueira/app-store-vale-core.git
   cd app-store-vale-core
   ```

2. **Configure o banco de dados**:

   Por padrão, a aplicação usa MongoDB. Configure o `application.yml` para apontar para sua instância local/remota.

   Para usar PostgreSQL:

   * Altere o `application.yml` para o datasource PostgreSQL
   * Os scripts Flyway serão aplicados automaticamente

3. **Execute a aplicação**:

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Executar com Docker**:

   ```bash
   docker build -t app-store-vale-core .
   docker run -p 8080:8080 app-store-vale-core
   ```

## ☁️ Deploy no Google Cloud Run

1. **Configure o Google Cloud CLI**

2. **Autentique-se e selecione o projeto correto**

3. **Construa e envie a imagem para o Container Registry**:

   ```bash
   gcloud builds submit --tag gcr.io/SEU-PROJETO/app-store-vale-core
   ```

4. **Implante no Cloud Run**:

   ```bash
   gcloud run deploy app-store-vale-core \
     --image gcr.io/SEU-PROJETO/app-store-vale-core \
     --platform managed \
     --region us-central1 \
     --allow-unauthenticated
   ```

## 📄 Licença

Este projeto está licenciado para fins educacionais e profissionais. Fique à vontade para explorar, contribuir e personalizar.

## 🤝 Contribuições

Pull requests são bem-vindos. Para grandes mudanças, por favor, abra uma issue primeiro para discutir o que você gostaria de modificar.

## 📢 Contato

Desenvolvido por [Rafael N. Siqueira](https://github.com/rnsiqueira).
