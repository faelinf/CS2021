import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ServiceTestAdress implements  ServiceAdress{

    private final List<CadastroEndereco> bancoDeEnderecosCadastrados = Arrays.asList(CadastroEndereco.builder()
                .endereco(Endereco.builder().bairro(Bairro.builder().nome("Primeiro Bairro").cidade(Cidade.builder()
                .nome("cidade de Goiânia").estado(Estado.builder().nome("Estado de Goiás").pais(Pais.builder().nome("País Brasil")
                .build()).build()).build()).build()).build()).build(),
                    CadastroEndereco.builder()
                            .endereco(Endereco.builder()
                                    .bairro(Bairro.builder()
                                            .nome("Bairro um")
                                            .cidade(Cidade.builder()
                                                    .nome("GYN")
                                                    .estado(Estado.builder()
                                                            .nome("Goiás")
                                                            .pais(Pais.builder().nome("Brasil")
                .build()).build()).build()).build()).build()).build());

    @Override
    public List<Logradouro> consultaPorTipo(LogradouroTipe tipoLogradouro) {
        return new ArrayList<>(this.bancoDeEnderecosCadastrados
                .stream()
                .filter(cadastroEndereco -> cadastroEndereco
                        .getEndereco().getLogradouro().getTipoLogradouro().equals(tipoLogradouro))
                .map(cadastroEndereco -> cadastroEndereco.getEndereco().getLogradouro())
                .collect(Collectors.toSet()));
    }

    @Override
    public List<Endereco> buscatipo(EnderecoTipo tipoEndereco) {
        return this.obterEndereco(endereco -> endereco.getTipoEndereco().equals(tipoEndereco));
    }

    @Override
    public List<Endereco> buscaCEP(int cep) {
        return this.obterEndereco(endereco -> endereco.getCEP().equals(cep));
    }

    @Override
    public List<Endereco> buscaLogradouro(Logradouro logradouro) {
        return this.obterEndereco(endereco -> endereco.getLogradouro().equals(logradouro));
    }

    @Override
    public List<Endereco> buscaBairro(Bairro bairro) {
        return this.obterEndereco(endereco -> endereco.getBairro().equals(bairro));
    }

    @Override
    public List<Endereco> buscaCidade(Cidade cidade) {
        return this.obterEndereco(endereco -> endereco.getBairro().getCidade().equals(cidade));
    }

    @Override
    public List<Cidade> cidadeEstado(Estado estado) {
        return new ArrayList<>(this.bancoDeEnderecosCadastrados
                .stream()
                .map(cadastroEndereco -> cadastroEndereco.getEndereco().getBairro().getCidade())
                .filter(cidade -> cidade.getEstado().equals(estado))
                .collect(Collectors.toSet()));
    }

    private List<Endereco> obterEndereco(Predicate<Endereco> predicate) {
        return new ArrayList<>(this.bancoDeEnderecosCadastrados
                .stream()
                .map(CadastroEndereco::getEndereco)
                .filter(predicate)
                .collect(Collectors.toSet()));
    }

    @Override
    public List<Estado> buscaPais(Pais pais) {
        return new ArrayList<>(this.bancoDeEnderecosCadastrados
                .stream()
                .map(cadastroEndereco -> cadastroEndereco
                        .getEndereco()
                        .getBairro()
                        .getCidade()
                        .getEstado())
                .filter(estado -> estado.getPais().equals(pais))
                .collect(Collectors.toSet()));
    }
}
