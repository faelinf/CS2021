# Tarefa 025 - Técnicas de construção baseadas em estado e tabelas - 10/11/2021.

1. Considere o título desta tarefa. Para compreendê-lo, solicito que seja efetuada uma pesquisa a respeito do padrão de projeto _State_, considerando sua aplicabilidade não somente ao escopo de um ou outro objeto do sistema, mas ao próprio sistema:
2. Elaborar um resumo descritivo do resultado da pesquisa.

**INSTRUÇÕES**
1. Esta pesquisa é parte do conteúdo destinado para a complementação de carga horária, para o cumprimento da carga regimental de 128hs alocada à disciplina.
2. A entrega deve ser feita no seu repositório pessoal no _github_, na _branch_, dentro de uma pasta chamada **tarefa025**.
4. O prazo para entrega desta tarefa é as 23h59min do dia 10/11/2021.

# Resposta:
O padrão de projeto State, nada mais é que um padrão que permite que um objeto altere o comportamento quando seu estado interno for alterado.
Uma questão que pode ser uma barreira nesse padrão, seria a extrema complexidade no código quando tentamos gerênciar 
comportamentos diferentes, dependendo de um número de estados diferentes, outro ponto seria a manutenção desse código,
pois podem apontar a uma inconsistência de estados atuais na forma de implementação dos diferentes 
estados no código.
Contudo, uma grande vantagem, sem dúvudas, é possibilitar que um objeto altere seu comportamento de acordo com o estado interno que se encontra em um dado momento.

