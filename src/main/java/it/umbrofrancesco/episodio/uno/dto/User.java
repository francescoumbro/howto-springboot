package it.umbrofrancesco.episodio.uno.dto;

/**
 * Rappresenta un utente con nome, cognome ed email.
 * <p>
 * Questo record garantisce che i campi non siano nulli o vuoti.
 *
 * @param name    Il nome dell'utente. Non può essere nullo o vuoto.
 * @param surname Il cognome dell'utente. Non può essere nullo o vuoto.
 * @param email   L'email dell'utente. Non può essere nulla o vuota.
 */
public record User(
        String name,
        String surname,
        String email
) {
    /**
     * Costruttore del record User.
     * <p>
     * Valida che i campi non siano nulli o vuoti.
     *
     * @param name    il nome dell'utente
     * @param surname il cognome dell'utente
     * @param email   l'email dell'utente
     * @throws IllegalArgumentException se uno dei campi è nullo o vuoto
     */
    public User {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Surname cannot be null or blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
    }
}
