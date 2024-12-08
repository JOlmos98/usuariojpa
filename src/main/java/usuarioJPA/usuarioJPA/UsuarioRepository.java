package usuarioJPA.usuarioJPA;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	/* 
	 * Por defecto, la interfaz CrudRepository nos proporciona los siguientes métodos:
	 * 
	 * - <S extends T> S save(S entity): Guarda o actualiza una entidad.
	 * - <S extends T> Iterable<S> saveAll(Iterable<S> entities): Guarda o actualiza múltiples entidades.
	 * - Optional<T> findById(ID id): Busca una entidad por su identificador.
	 * - boolean existsById(ID id): Verifica si una entidad existe por su identificador.
	 * - Iterable<T> findAll(): Recupera todas las entidades.
	 * - Iterable<T> findAllById(Iterable<ID> ids): Recupera entidades por sus identificadores.
	 * - long count(): Cuenta el número total de entidades.
	 * - void deleteById(ID id): Elimina una entidad por su identificador.
	 * - void delete(T entity): Elimina una entidad específica.
	 * - void deleteAllById(Iterable<? extends ID> ids): Elimina múltiples entidades por sus identificadores.
	 * - void deleteAll(Iterable<? extends T> entities): Elimina múltiples entidades.
	 * - void deleteAll(): Elimina todas las entidades de la tabla.
	 * 
	 * Nota: Estos métodos están disponibles sin necesidad de implementarlos. 
	 * Puedes utilizarlos directamente al inyectar el repositorio en tu aplicación.
	 */

// Podemos crear métodos personalizados como estos:
	 
	public List<Usuario> findByNombre(String nombre);
	public List<Usuario> findByEmail(String email);
	
}
