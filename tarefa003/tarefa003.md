<p style="text-align: center;"><font size="5"><b>Git Exercícios</b></font></p1></p>
<DIV align="justify">

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
O comando é git version.
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
  Exibe comandos que mostram funcionalidades que podem gerar dúvidas
  b. git help checkout
  c. git help merge
  d. git init
  Cria um novo repositório
  e. git add --all
  O arquivo será enviado para staging area e configurado para o próximo commit.  
  f. git add -u
  Esse comando tem como objetivo adicionar os arquivos alterados e monitorados pelo  Git. 
  g. git config -l
  Tem como objetivo mostrar a lista com as configurações do úsuario. 
  h. git mv a.txt b.txt
  É utilizado para alterar o nome dos arquivos como os exemplos acima. 
  i. git reset --hard
  Tem como objetico resetar os commit, mostrando o último commit 
  j. git log -27
  Mostrar o registro dos últimos 27 commits. 
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
git add ... 
git rm ... 
git mv... 
Executar um "commit" 
git commit... 
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
O Git show é utilizado para mostrar o último commit.
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
O comando git status
6. Qual o comando para efetuar um _commit_?
O comando git commit -m "Olá Mundo". 
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
Comando Git checkout --
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
É necessário criar um arquivo .gitignore  para que seja desconsiderado pelo Git. 
9. O que acontece se o seu repositório local for acidentalmente removido?
Vai perder as informações do repositório local.
10. Como clonar um repositório remoto?
O comando git clone
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
O comando git log --pretty=oneline 
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
 Comando ~/.gitconfig 
13. Qual o comando para criar um repositório local?
É necessário adicionar uma nova pasta , abrir e executar o comando git init. 
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
Podemos afirmar que o nome continua o mesmo do repositório onde foi executado e endereço onde encontrar 
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
Git add --all 
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
 -abbrev-commit 
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
Não, porque o comando git add -u adiciona os arquivos editados e que são analisados pelo git. 
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
git reset --soft HEAD~1 ,git reset --hard 
git reset --soft HEAD~1 (volta ao último commit e mantém os últimos arquivos no Stage) 
git reset --hard(mostra o úlitmo commit) 
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
 Git clean -f 

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
 arquivo .gitignore  

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
*.class  

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
 Irá aparecer o nome e email dos participantes. 

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
Irá aparecer a URL remota do diretirio jqueryrepo. 

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
É necessário executar o comando git tag para listar todas as tags 
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
git tag -a   
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
Após executado vai exibir os dados da tag junto com o commit. 

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
O comando mostra a informação da pessoa que criou a tag, a data de quando o commit foi taggeado, e a mensagem antes de mostrar a informação do commit. 

30. O que o comando **git push origin 3.4-gold** teria como efeito?
O comando mostra a informação da pessoa que criou a tag, a data de quando o commit foi taggeado, e a mensagem antes de mostrar a informação do commit. 

31. Após executar um commit, qual o efeito de **git commit --amend**?
 Usado para simplesmente editar a mensagem de commit anterior sem alterar o seu instantâneo. Funde o antigo commit com o novo(o antigo com corre 

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
Após executado vai exibir os dados da tag junto com o commit. 

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
 Descarta as mudanças ocorridas no arquivo. 

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
 O git reset HEAD x.txt retira o arquivo x.txt da staging Area,já o git checkout -- a.txt descarta as mudanças feitas no arquivo


</DIV/>