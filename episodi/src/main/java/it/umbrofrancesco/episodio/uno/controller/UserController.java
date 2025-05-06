package it.umbrofrancesco.episodio.uno.controller;

import it.umbrofrancesco.episodio.uno.dto.User;
import it.umbrofrancesco.episodio.uno.service.api.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST per la gestione degli utenti.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final IUserService userService;

    /**
     * Costruttore per iniettare il servizio utente.
     *
     * @param userService il servizio per la gestione degli utenti
     */
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * Restituisce tutti gli utenti.
     *
     * @return una lista di utenti
     */
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * Restituisce un utente dato il suo indirizzo email.
     *
     * @param email l'email dell'utente
     * @return l'utente corrispondente o una risposta 404 se non trovato
     */
    @GetMapping("/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
        User user = userService.getUserByEmail(email);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    /**
     * Crea un nuovo utente.
     *
     * @param user l'utente da creare
     * @return l'utente creato con una risposta 201
     */
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    /**
     * Aggiorna un utente esistente.
     *
     * @param email       l'email dell'utente da aggiornare
     * @param updatedUser i dati aggiornati dell'utente
     * @return l'utente aggiornato o una risposta 404 se non trovato
     */
    @PutMapping("/{email}")
    public ResponseEntity<User> updateUser(@PathVariable String email, @RequestBody User updatedUser) {
        User user = userService.updateUser(email, updatedUser);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    /**
     * Elimina un utente dato il suo indirizzo email.
     *
     * @param email l'email dell'utente da eliminare
     * @return una risposta 204 se eliminato o 404 se non trovato
     */
    @DeleteMapping("/{email}")
    public ResponseEntity<Void> deleteUser(@PathVariable String email) {
        boolean deleted = userService.deleteUser(email);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
