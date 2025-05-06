# Gestione Utenti - API REST

Un'applicazione Spring Boot per la gestione degli utenti con operazioni CRUD esposte tramite un'API REST.

---

## 📑 Indice

- [📌 Descrizione](#descrizione)
- [🛠️ Annotazioni Utilizzate](#annotazioni-utilizzate)
  - [Spring Framework](#spring-framework)
  - [JavaDoc](#javadoc)
- [🔗 Invocare i Servizi con curl](#invocare-i-servizi-con-curl)
  - [1. Ottenere tutti gli utenti](#1-ottenere-tutti-gli-utenti)
  - [2. Ottenere un utente per email](#2-ottenere-un-utente-per-email)
  - [3. Creare un nuovo utente](#3-creare-un-nuovo-utente)
  - [4. Aggiornare un utente esistente](#4-aggiornare-un-utente-esistente)
  - [5. Eliminare un utente](#5-eliminare-un-utente)
- [📋 Requisiti](#requisiti)
- [⚙️ Configurazione](#configurazione)
- [🚀 Avvio dell'Applicazione](#avvio-dellapplicazione)

---

## 📌Descrizione

Un'applicazione Spring Boot per la gestione degli utenti con operazioni CRUD esposte tramite un'API REST.

---

## 🛠️Annotazioni Utilizzate

### Spring Framework

- **`@RestController`**: Indica che la classe è un controller REST.
- **`@RequestMapping`**: Percorso base per tutti gli endpoint.
- **`@GetMapping`**, **`@PostMapping`**, **`@PutMapping`**, **`@DeleteMapping`**: Mappano le richieste HTTP.
- **`@PathVariable`**: Legge parametri dalla URL.
- **`@RequestBody`**: Converte il JSON in oggetto Java.
- **`@Service`**: Logica di business.

### JavaDoc

- **`{@inheritDoc}`**: Eredita la documentazione dalla dichiarazione del metodo nell'interfaccia.

---

## 🔗Invocare i Servizi con `curl`

### 1. Ottenere tutti gli utenti

```bash
curl -X GET http://localhost:8080/users
```

### 2. Ottenere un utente per email

```bash
curl -X GET http://localhost:8080/users/{email}
```

Sostituisci `{email}` con l'email dell'utente desiderato.

### 3. Creare un nuovo utente

```bash
curl -X POST http://localhost:8080/users \
  -H "Content-Type: application/json" \
  -d '{
    "email": "test@example.com",
    "name": "Test User"
}'
```

### 4. Aggiornare un utente esistente

```bash
curl -X PUT http://localhost:8080/users/{email} \
  -H "Content-Type: application/json" \
  -d '{
    "email": "test@example.com",
    "name": "Updated User"
}'
```

Sostituisci `{email}` con l'email dell'utente da aggiornare.

### 5. Eliminare un utente

```bash
curl -X DELETE http://localhost:8080/users/{email}
```

Sostituisci `{email}` con l'email dell'utente da eliminare.

---

## 📋Requisiti

- Java 24
- Maven
- Spring Boot 3.4.5

---

## ⚙️Configurazione

Configura il file `application.properties` per il tuo ambiente.

---

## 🚀Avvio dell'Applicazione

```bash
mvn spring-boot:run
```

L'applicazione sarà disponibile su `http://localhost:8080`.
