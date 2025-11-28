# 🎟️ EventFlow — Sistema de Gestão de Eventos e Ingressos

<p align="center">
  <strong>Plataforma completa para criação, gerenciamento e venda de ingressos.</strong><br>
  Backend em <strong>Java + Spring Boot</strong> e Frontend em <strong>React</strong>.
</p>

---

## 📌 Visão Geral

O **EventFlow** é um sistema profissional de gestão de eventos que permite:

* Organizadores criarem e gerenciarem eventos, lotes, ingressos e vendas.
* Usuários visualizarem eventos, comprarem ingressos e acessarem QR Codes para check-in.
* Acompanhamento de vendas em tempo real e controle de entrada.

Projetado com arquitetura escalável e tecnologias amplamente usadas no mercado.

---

## 🏗️ Arquitetura

Este projeto foi construído seguindo boas práticas modernas:

### **Backend**

* Arquitetura separada por camadas: Controllers, Services, Repositories e DTOs.
* Migrações versionadas com **Flyway**.
* Autenticação com **JWT + Spring Security**.
* Acesso a dados com **JPA/Hibernate**.

### **Frontend**

* Estrutura organizada por páginas, componentes, hooks e serviços.
* Consumo de API via **Axios**.
* Estado global com **Context API**.
* Estilização com **TailwindCSS** para alta produtividade.

---

## 🚀 Tecnologias Utilizadas

### **Backend — Java + Spring Boot**

* Java 21
* Spring Boot 3
* Spring Web
* Spring Data JPA
* Spring Security (JWT)
* PostgreSQL
* Flyway
* Lombok

### **Frontend — React**

* React 18
* React Router
* Axios
* Context API
* TailwindCSS *(ou Material UI opcional)*

### **Infraestrutura**

* Docker / Docker Compose
* GitHub Projects + Issues
* Railway / Render *(deploy opcional)*

---

## 📂 Estrutura do Repositório

```
/eventflow-backend
   ├── src/main/java/com/eventflow
   │      ├── controllers
   │      ├── services
   │      ├── repositories
   │      ├── models
   │      └── dtos
   ├── src/main/resources
   │      ├── application.yml
   │      └── db/migration
   └── pom.xml

/eventflow-frontend
   ├── src
   │     ├── pages
   │     ├── components
   │     ├── hooks
   │     └── services
   └── package.json
```

---

## 🧩 Funcionalidades Principais

### 🎫 **Para Organizadores**

* Criar e editar eventos
* Criar lotes e categorias de ingressos
* Definir quantidades, preços e datas
* Dashboard com vendas em tempo real
* Check-in por QR Code

### 👥 **Para Usuários**

* Visualizar eventos
* Filtrar por categoria, local e data
* Comprar ingressos
* Acessar carteira de ingressos
* Gerar QR Code para entrada

---

## ▶️ Como Rodar o Projeto

### **1️⃣ Backend**

```bash
cd eventflow-backend
./mvnw clean install
./mvnw spring-boot:run
```

Caso use Docker:

```bash
docker compose up -d
```

### **2️⃣ Frontend**

```bash
cd eventflow-frontend
npm install
npm run dev
```

---

## 🧪 Testes (Opcional)

* Testes de unidade com **JUnit + Mockito** podem ser adicionados.
* Testes de integração com **Spring Test**.

---

## 🧑‍💻 Contribuidores

| Nome       | Função                    |
| ---------- | ------------------------- |
| **Kaique** | Full Stack / Backend Lead |
| **Paulo**  | Backend                   |
| **Lucas**  | Frontend                  |
