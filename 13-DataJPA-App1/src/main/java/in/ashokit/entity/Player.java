package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Bhubaneswar Behera @date 01-Jul-2022
 *
 */
@Entity
@Table(name = "CRICKET_PLAYER")
public class Player {
	@Id
	@Column(name="PLAYER_ID")
	private Integer playeId;
	
	@Column(name="PLAYER_NAME")
	private String playeName;
	
	@Column(name="PLAYER_AGE")
	private Integer playeAge;
	
	private String location;

	public Integer getPlayeId() {
		return playeId;
	}

	public void setPlayeId(Integer playeId) {
		this.playeId = playeId;
	}

	public String getPlayeName() {
		return playeName;
	}

	public void setPlayeName(String playeName) {
		this.playeName = playeName;
	}

	public Integer getPlayeAge() {
		return playeAge;
	}

	public void setPlayeAge(Integer playeAge) {
		this.playeAge = playeAge;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Player [playeId=" + playeId + ", playeName=" + playeName + ", playeAge=" + playeAge + ", location="
				+ location + "]";
	}

}
