package com.pucrs.persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pucrs.model.NotaFiscal;
import com.pucrs.model.Pessoa;

public class NotaFiscalDAO {

	public List<NotaFiscal> getByCPF(Pessoa pessoa) {
		String cpf = pessoa.getCPF();
		ArrayList<NotaFiscal> listaNotas = new ArrayList<NotaFiscal>();
		String caminho = "H:\\Workspace\\friendly-couscous\\04744325807-nf.csv";
		BufferedReader br = null;
		String line = "";
		String delimitador = ";";
		try {

			br = new BufferedReader(new FileReader(caminho));
			while ((line = br.readLine()) != null) {

				String[] country = line.split(delimitador);

				System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
