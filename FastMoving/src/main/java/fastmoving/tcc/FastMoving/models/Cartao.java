package fastmoving.tcc.FastMoving.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;

import lombok.Getter;
import lombok.Setter;

@Table(name="cartao")
@Entity
@Setter
@Getter
public class Cartao {

	@Column(name="id_cartao", columnDefinition = "NUMERIC")
	@GeneratedValue
	@Id
	private int id;
	
	@Column(name="data_vencimento")
	private Date data;
	
	@Column(name="nome_cartao")
	private String nome;
	
	@Column(name="numero_cartao", columnDefinition = "NUMERIC")
	private int numero;
	
	@Column(name="codigo_verificacao")
	private int codigo;
	
	/* d */
	
}
