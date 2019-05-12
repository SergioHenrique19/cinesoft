/* Trabalho final de PLP (2019/01)
 * Este código representa a estrutura de uma sessao.
 * Utiliza um enum com os dias da semana e referencia um filme. */

package models;

import entities.enums.DayOfWeek;

public class Sessions {
	// TODO funcao para adicionar somente filmes disponíveis => by Sergio
	private int idSession;
	private DayOfWeek dayOfWeek;
	private int time;
	private Movies movie;   // Atributo que referencia "filme"
	private boolean language;   // Onde true = dublado, false = legendado
	private boolean screen;   // Onde true = 3D, false = 2D
	
	// Construtor vazio
	public Sessions() {}

	// Construtor com parâmetros
	public Sessions(int idSession, DayOfWeek dayOfWeek, int time, Movies movie, boolean language, boolean screen) {
		this.idSession = idSession;
		this.dayOfWeek = dayOfWeek;
		this.time = time;
		this.movie = movie;
		this.language = language;
		this.screen = screen;
	}

	public int getIdSession() {
		return idSession;
	}

	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}

	public boolean isLanguage() {
		return language;
	}

	public void setLanguage(boolean language) {
		this.language = language;
	}

	public boolean isScreen() {
		return screen;
	}

	public void setScreen(boolean screen) {
		this.screen = screen;
	}	
}
