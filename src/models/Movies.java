/* Trabalho Final de PLP (2019/01)
 * Este codigo representa a estrutura de um filme.
 * Pode ser considerado o principal, visto que uma sessao
 * precisa ter um filme vinculando-a */

package models;

import java.util.Date;

public class Movies {	
	private int idMovie;
	private String title;
	private Date releaseDate;
	private int runtime;   // Duração deve ser em minutos
	private boolean available;
	
	// Construtor vazio
	public Movies() {}
	
	// Construtor com parâmetros
	public Movies(int idMovie, String title, Date releaseDate, int runtime, boolean available) {
		this.idMovie = idMovie;
		this.title = title;
		this.releaseDate = releaseDate;
		this.runtime = runtime;
		this.available = available;
	}

	public int getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(int idMovie) {
		this.idMovie = idMovie;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
