# 🎟️ EventFlow – Sistema de Gestão de Eventos e Ingressos

## 📌 Sobre o Projeto

O **EventFlow** é um sistema completo para criação, gestão e venda de ingressos para eventos.
Organizadores podem administrar eventos, tipos de ingressos e check-in via QR Code, enquanto usuários compram ingressos de forma simples e segura.

---

## 🚀 Tecnologias Utilizadas

### **Backend**

* .NET 8
* C#
* PostgreSQL
* Entity Framework Core
* JWT Authentication
* FluentValidation
* AutoMapper
* Swagger

### **Frontend**

* React + Vite
* React Router
* Axios
* TailwindCSS
* Zustand
* QrCode.react

---

## 🧱 Arquitetura

### **Backend – Clean Architecture**

* Domain
* Application
* Infrastructure
* API

### **Frontend – Estrutura Padrão**

* Pages
* Components
* Services
* Context/Store

---

## 📂 Estrutura do Repositório

```
/eventflow-backend
    /src
       /Domain
       /Application
       /Infrastructure
       /API
    README.md

/eventflow-frontend
    /src
       /components
       /pages
       /services
       /store
    README.md
```

---

## 🗄️ Banco de Dados

O sistema utiliza **PostgreSQL**, contendo tabelas para:

* Users
* Profiles
* Events
* Categories
* TicketTypes
* Tickets
* Orders
* Checkins

---

## ▶️ Como Rodar o Projeto

### **Backend**

```bash
cd eventflow-backend
dotnet restore
dotnet ef database update
dotnet run
```

### **Frontend**

```bash
cd eventflow-frontend
npm install
npm run dev
```

---

## 👥 Times e Funções

* **Kaique** — Full Stack / Backend Lead
* **Paulo** — Backend
* **Lucas** — Frontend
