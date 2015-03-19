package p;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class E implements Serializable {

	private Long v;
	private List<A> a;
	private K k = new K();

	@Id
	public Long getV() {
		return v;
	}

	public void setV(Long v) {
		this.v = v;
	}

	@ManyToOne
	@Id
	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	@OneToMany
	public List<A> getA() {
		return a;
	}

	public void setA(List<A> a) {
		this.a = a;
	}
}
