# 📖Episodio Uno - Annotazioni e API

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

### 5. Eliminare un utente

```bash
curl -X DELETE http://localhost:8080/users/{email}
```

Sostituisci `{email}` con l'email dell'utente da eliminare.
