package p;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class S implements Serializable {

	private String z;
	private String x;
	private E e;

	@Id
	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}

	@Id
	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	@ManyToOne
	@Id
	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

}
