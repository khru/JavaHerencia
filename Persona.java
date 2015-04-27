/**
 * @author Emmanuel Valverde Ramos
 * @version 26/04/2015 1.0
 *
 */
public class Persona 
{
	//CONSTANTES
	//***********
	final static String DEF_NOMBRE = "nombre";
	final static String DEF_APELLIDOS = "apellido1 apellido2";
	
	//ATRIBUTOS
	//***********
	private String nombre;
	private String apellidos;
	
	
	//CONSTRUCTORES
	//**************
	/**
	 * Constructor por defecto
	 */
	public Persona()
	{
		this.nombre = DEF_NOMBRE;
		this.apellidos = DEF_APELLIDOS;;
	}
	
	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param apellidos
	 */

	public Persona(String n, String a) 
	{
		setNombre(n);
		setApellidos(a);
	}
	
	/**
	 * Método constructor copia
	 * @param p Parametro de tipo persona
	 */
	public Persona(Persona p)
	{
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
	}

	
	
	//GETTER y SETTERS
	//*****************

	//GET
	
	/**
	 * Método get de nombre
	 * @return nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * Método get de apellidos 
	 * @return apellidos
	 */
	public String getApellidos() 
	{
		return apellidos;
	}
	
	//SET
	
	/**
	 * Método set de nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) 
	{
		if(nombre == null || nombre.equals("") || nombre.equals(" "))
		{
			this.nombre = DEF_NOMBRE;
		}
		else
		{
			this.nombre = nombre;
		}
	}

	/**
	 * Método set de apellidos
	 * @param apellidos 
	 */
	public void setApellidos(String apellidos) 
	{
		if(apellidos == null || apellidos.equals("") || apellidos.equals(" "))
		{
			this.apellidos = DEF_APELLIDOS;
		}
		else
		{
			this.apellidos = apellidos;
		}
		
	}
	//TOSTRING
	//***********
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return String.format("Persona [nombre=%s, apellidos=%s]", nombre,
				apellidos);
	}
	
	//CLONE
	//*********
	public Persona clone()
	{
		Persona p = new Persona(this.nombre, this.apellidos);
		return p;
	}
	
}
