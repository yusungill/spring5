package chap10;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

//복합 키 비 식별 관계
@Entity
//@IdClass(ParentId.class) //식별자 클래스
public class Parent {

	@Id
	@Column(name = "PARENT_ID1")
	private String id1;
	
	
	@EmbeddedId
	private ParentId id;
	
	public ParentId getId() {
		return id;
	}

	public void setId(ParentId id) {
		this.id = id;
	}

	@Id
	@Column(name = "PARENT_ID2")
	private String id2;
	
	private String name;

	public String getId1() {
		return id1;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
