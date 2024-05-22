package it.ms.api.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_user;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "username", unique = true, nullable = false)
	private String username;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	public Users() {

	}

	public Users(String password, String username, String email, String first_name, String last_name) {
		this.password = password;
		this.email = email;
		this.username = username;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public long getId() {
		return id_user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirst_name() {
        return first_name;
    }

	public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

	public String getLast_name() {
        return last_name;
    }

	public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

	@Override
	public String toString() {
		return "User [id=" + id_user + ", email=" + email + ", password=" + password + ", username=" + username + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
}
