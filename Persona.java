package Persona3;

public class Persona {
    // Poniendo un comentari
    private String nombre;
    private String apellidos;
    private int dnisinletra;
    private int edad;
    private String comidaFavorita;
    private String nacionalidad;

    private int edadPadre;

    private int hijos;
    private int telefono;
    private String signozodiaco;
    private int peso;
    private int numeroSeguridadSocial;
    private String estado_civil;


    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getDnisinletra(){
        return dnisinletra;
    }
    public int getNumeroSeguridadSocial(){
        return numeroSeguridadSocial;
    }


    public int getEdad(){
        return edad;
    }

    public int getEdadPadre(){
        return edadPadre;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    public int getHijos() {
        return hijos;
    }

    public int getTelefono(){
        return telefono;
    }

    public String getSignozodiaco(){
        return signozodiaco;
    }

    public int getPeso(){
        return peso;
    }

    public String getCodPostal(){
        return cp;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void setcomidaFavorita(String CF){
        this.comidaFavorita= CF;
    }

    public void setApellidos(String apell){
        this.apellidos = apell;
    }


    public void setDnisinletra(int dni){
        this.dnisinletra = dni;
    }
    public void setNumeroSeguridadSocial(int SgiS){
        this.numeroSeguridadSocial = SS;
    }
    public void setNumeroSeguridadSocial(String EstadoCivil){
        this.estado_civil = Estado_civil;
    }

    public void setEstudios(String estudios){
        this.estudios = estudios;
    }
    public String getEstudios() {
        return estudios;
    }
    public void setNacionalidad(){
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int ed){
        if (ed >= 21){
            System.out.println("Ya puedes beber y votar en los EEUU \n");
        } 
		else {
            System.out.println("El cola cao no esta tan mal \n");
        }
        this.edad = ed;
	}

    public void setEdadPadre(int ed){
        this.edadPadre = ed;
    }
	



    public void setNacionalidad(String nac){
        this.nacionalidad = nac;
    }

    public void setHijos(int hj) {
        if (hj>3){
            System.out.println("Eres familia numerosa \n");
        }
        this.hijos = hj;
    }

    public void setTelefono(int tlf){
        this.telefono = tlf;
    }


    public void setSignozodiaco(String signozodiaco){
        this.signozodiaco = signozodiaco;
    }

   

}
