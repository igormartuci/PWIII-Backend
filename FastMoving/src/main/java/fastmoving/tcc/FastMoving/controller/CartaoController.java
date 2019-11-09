package fastmoving.tcc.FastMoving.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import fastmoving.tcc.FastMoving.dao.CartaoDAO;
import fastmoving.tcc.FastMoving.models.Cartao;

@RestController
@RequestMapping("/cartao")
public class CartaoController {
	
	@Autowired
	private CartaoDAO dao;
	
	
	@PostMapping
	public void insert(@RequestBody Cartao card) {
		dao.save(card);
	}
	
	@GetMapping
	public List<Cartao> findAll(){
		return dao.findAll();
	}
	
	@GetMapping( path = "/{id}")
	public ResponseEntity<Cartao> findById(@PathVariable Integer id){
		return dao.findById(id)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping( path = "/{id}")
	public ResponseEntity<Cartao> update(@PathVariable("id") Integer id,
										 @RequestBody Cartao card){
		return dao.findById(id)
			.map(record -> {
				record.setNome(card.getNome());
				record.setData(card.getData());
				record.setCodigo(card.getCodigo());
				record.setNumero(card.getNumero());
				Cartao updated = dao.save(record);
				return ResponseEntity.ok().body(updated);
			}).orElse(ResponseEntity.notFound().build());
				
				
	}
	
	
	@DeleteMapping( path = "/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
		return dao.findById(id)
				.map(record -> {
					dao.deleteById(id);	
					return ResponseEntity.ok().build();
				}).orElse(ResponseEntity.notFound().build());
				
	}
}
	
	
