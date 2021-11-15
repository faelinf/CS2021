import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode

public class Endereco {
    
    private TipoEndereco EnderecoTipo;
    private Logradouro logradouro;
    private Integer numero;
    private String numeroComplemento;
    private String enderecoComplemento;
    private Integer CEP;
    private Bairro bairro;
}
