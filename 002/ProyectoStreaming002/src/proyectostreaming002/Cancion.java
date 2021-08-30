package proyectostreaming002;

public class Cancion {
    // los atributos
    private String titulo;
    private String artista;
    private int segundos;
    private Boolean esFavorita;
    private Boolean estaDescargada;
    
    // constructores

    public Cancion() {
        this.titulo = "";
        this.artista = "";
        this.segundos = 0;
        this.esFavorita = false;
        this.estaDescargada = false;
    }
    public Cancion(String titulo, String artista, int segundos, Boolean esFavorita, Boolean estaDescargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.segundos = segundos;
        this.esFavorita = esFavorita;
        this.estaDescargada = estaDescargada;
    }
    
    // getter and setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Boolean getEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(Boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    public Boolean getEstaDescargada() {
        return estaDescargada;
    }

    public void setEstaDescargada(Boolean estaDescargada) {
        this.estaDescargada = estaDescargada;
    }
    
    // metodos customer
    
    public String esExtensa()
    {
        if(this.segundos > (5*60))
        {
            return "La canción es extensa";
        }
        else
        {
            return "La canción no es extensa";
        }
    }
    
}
