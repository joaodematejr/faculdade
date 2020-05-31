package n2.sc.cesusc.edu.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import n2.sc.cesusc.edu.entidade.Mercadoria;

public class MercadoriaController {

	Mercadoria mercadoria = new Mercadoria();

	public void salvar(String nome, String descricao) throws IOException {

		UUID id = UUID.randomUUID();

		mercadoria.setId(id);
		mercadoria.setNome(nome);
		mercadoria.setDescricao(descricao);

		try {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			FileWriter arquivoJson = new FileWriter("json/listaclientes.json");
			gson.toJson(mercadoria, arquivoJson);
			arquivoJson.close();
			JOptionPane.showMessageDialog(null, "Mercadoria salva com sucesso !!!",
					"Aviso !!!", JOptionPane.PLAIN_MESSAGE);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro por favor entre em contato com desenvolvedor !!!",
					"Aviso !!!", JOptionPane.PLAIN_MESSAGE);
			e.printStackTrace();
		}
	}

}
