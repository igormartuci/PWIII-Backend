package fastmoving.tcc.FastMoving.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern =  "dd/MM/yyyy", locale = "pt-BR" ,timezone="AGT")
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
