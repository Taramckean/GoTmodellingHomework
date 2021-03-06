package models;

import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "icedragons")
	public class IceDragon extends MysticalCreature {
		Whitewalker whitewalker;


		public IceDragon(){}

		public IceDragon(SpecialPower specialPower, Boolean alive, int strength, int attackPoints, Whitewalker whitewalker) {
			super(specialPower, alive, strength, attackPoints);
			this.whitewalker = whitewalker;

		}

		@ManyToOne
		@JoinColumn(name="whitewalker_id", nullable = true)
		public Whitewalker getWhitewalker() {
			return whitewalker;
		}

		public void setWhitewalker(Whitewalker whitewalker) {
			this.whitewalker = whitewalker;
		}
	}


