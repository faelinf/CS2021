# Tarefa 024 - Configuração de software em tempo de execução - 10/11/2021

1. Considere o título desta tarefa. Para compreendê-lo, solicito que seja efetuada uma pesquisa a respeito de qualquer um dos seguintes temas:

  1.1 Profile.

  1.2 IoC Inversão de Controle (Inversion of Control).

  1.3 Injeção de Dependências.

2. Elaborar um resumo descritivo com o resultado obtido na pesquisa do tema selecionado.

# Respostas:

O tema selecionado foi Injeção de Dependência, e nada mais é que um padrão de projeto utilizado para retardar
o aumento do nível de acoplamento de código em um sistema. As aplicações com essa característica de baixo acoplamento 
de código são melhores pois torna-se mais prática e fácil da manutenibilidade de novas funcionalidades e também habilita 
a utilização de mocks para realizar unit testes.

O padrão Injeção de dependência diz: Módulos de alto nível não devem depender de módulos de baixo nível. 
Ambos devem depender de abstrações. Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.