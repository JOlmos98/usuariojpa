package usuarioJPA.usuarioJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsuarioJpaApplication implements CommandLineRunner {
	@Autowired
	UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(UsuarioJpaApplication.class, args);
		
	}

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Iniciamos programa:");
		
		//ALTA:
		Usuario u1=new Usuario("Jesús", "olmos98@gmail.com", "1234");
		usuarioRepository.save(u1);
		usuarioRepository.save(new Usuario("Carla", "carlafj@gmail.com", "12345"));
		
		//CONSULTA:
		usuarioRepository.findByEmail("carlafj@gmail.com");
		System.out.println(usuarioRepository.findById(1));
		System.out.println(usuarioRepository.findById(2));
		System.out.println(usuarioRepository.findById(3));
		usuarioRepository.findByNombre("Jesús");
		
		// //////////////////////////////////
		// //////////// ↓ IA ↓ //////////////
		// //////////////////////////////////
		
		// Buscar por ID
	    usuarioRepository.findById(1).ifPresent(usuario -> {
	        System.out.println("Usuario encontrado por ID 1:");
	        System.out.println("Nombre: " + usuario.getNombre());
	        System.out.println("Email: " + usuario.getEmail());
	        System.out.println("Password: " + usuario.getPassword());
	    });

	    usuarioRepository.findById(2).ifPresent(usuario -> {
	        System.out.println("Usuario encontrado por ID 2:");
	        System.out.println("Nombre: " + usuario.getNombre());
	        System.out.println("Email: " + usuario.getEmail());
	        System.out.println("Password: " + usuario.getPassword());
	    });

	    usuarioRepository.findById(3).ifPresentOrElse(
	        usuario -> System.out.println("Usuario encontrado: " + usuario.getNombre()),
	        () -> System.out.println("No se encontró un usuario con ID 3.")
	    );

	    // Listar todos los usuarios
	    System.out.println("Todos los usuarios en la base de datos:");
	    usuarioRepository.findAll().forEach(usuario -> {
	        System.out.println("Nombre: " + usuario.getNombre());
	        System.out.println("Email: " + usuario.getEmail());
	        System.out.println("Password: " + usuario.getPassword());
	        System.out.println("---");
	    });
		
		// //////////////////////////////////
		// //////////// ↑ IA ↑ //////////////
		// //////////////////////////////////
		
		
		//BAJA:
		usuarioRepository.delete(u1);

	}

}