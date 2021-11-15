<p style="text-align: center;"><font size="5"><b>Git <i>branching</i> (Exercícios:)</b></font></p1></p>
<DIV align="justify">

1. Qual o nome do branch padrão do Git?
O nome é master
2. O que o comando **<code>git branch nome</code>** realiza?
Esse comendo define um branch com o nome definido.
3. Como criar um branch a partir de um commit específico?
Utilizando o comando git branch
4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?
Será criada uma nova branch, na master, um erro 234. 
5. Qual o comando para se alternar para um branch de nome **experimento2**?
O comando utilizado é git checkout experimento2. 
6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?
Assim que executamos o comando git branch conseguimos visualizar dois branchs (b1, b2), exemplo : $ git branch
7. O que o comando **<code>git checkout -b</code>** nome faz?
Esse comando tem o objetivo de criar uma nova branch, assim como a main branch. 
8. Qual a função do <code>**comando git branch -d teste</code>**?
Essa tem como objetivo realizar a exclusão do branch teste.
9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.
$ git branch Z
$ git checkout Z
$ git checkout master 
$ Switched to branch "main"
$ git checkout -b 'Corriginfo
$' Switched to a new branch "Corrigindo"
$ vim index.html 
$ git commit -a -m 'não obteve exito'
$ git checkout master 
$ git merge Corrigindo
$ git branch -d Corrigindo
$ git checkout master 
$ git merge X

</DIV/>