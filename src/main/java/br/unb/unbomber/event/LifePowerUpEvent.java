package br.unb.unbomber.event;

import br.unb.unbomber.core.Event;

/**
 * Classe que indica quando uma entidade coletar um Power Up do tipo Life.
 * 
 * @version 0.3 19 Nov 2014
 * @author Grupo 5 - Dayanne <dayannefernandesc@gmail.com>
 */
public class LifePowerUpEvent extends Event {
	/** Id da entidade que coletou o Power Up. */
	private int sourceId;

	/**
	 * Construtor da classe.
	 * 
	 * @param sourceId
	 *            Id da entidade que coletou o Power Up.
	 */
	public LifePowerUpEvent(int sourceId) {
		setSourceId(sourceId);
	}

	/**
	 * Coleta a identidade da entidade que coletou o Power Up.
	 * 
	 * @return sourceId Id da entidade que coletou o Power Up.
	 */
	public int getSourceId() {
		return sourceId;
	}

	/**
	 * Atribui a identidade da entidade que coletou o Power Up.
	 * 
	 * @param sourceId
	 *            Id da entidade que coletou o Power Up.
	 */
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

}
