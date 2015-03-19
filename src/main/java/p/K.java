package p;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class K {
	private Long i;
	private List<E> e = new ArrayList<E>();

	@Id
	public Long getI() {
		return i;
	}

	public void setI(Long i) {
		this.i = i;
	}

	@OneToMany
	public List<E> getE() {
		return e;
	}

	public void setE(List<E> e) {
		this.e = e;
	}

}
