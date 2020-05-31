package n2.sc.cesusc.edu.mb;

import java.io.IOException;

import n2.sc.cesusc.edu.controller.MercadoriaController;
import n2.sc.cesusc.edu.entidade.Mercadoria;

public class MercadoriaMB {
	Mercadoria mercadoria = new Mercadoria();
	MercadoriaController mercadoriaController = new MercadoriaController();
	
	public void salvarMercadoria(String nome, String descricao) throws IOException {	
		mercadoriaController.salvar(nome, descricao);
	}

}
