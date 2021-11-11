import java.util.List;

public interface ServiceAdress {
    
    List<Logradouro> buscatipo(LogradouroTipe tipoLogradouro);
    List<Endereco> buscatipo(EnderecoTipo tipoEndereco);
    List<Endereco> buscaCEP(int cep);
    List<Endereco> buscaLogradouro(Logradouro logradouro);
    List<Endereco> buscaBairro(Bairro bairro);
    List<Endereco> buscaCidade(Cidade cidade);
    List<Cidade> cidadeEstado(Estado estado);
    List<Estado> buscaPais(Country pais);
}
