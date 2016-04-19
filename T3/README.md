#Trabalho T3 - Hortifruti
###Rodrigo, Yuri e Maurício

##Hortifruti

Uma loja de hortifruti colocou um serviço de venda pela internet.
A classe Cesta contém um lista de, no máximo, 12 produtos.
Cada produto pode ser de um dos tipos (subclasses) derivados de Produto.
Cada uma das subclasses define um valor fixo que vale para todos os objetos daquela classe e corresponde ao preço de cada unidade do produto.
Na classe Cesta, o método adicionarProduto coloca um novo produto na cesta.

Você dever usar uma variável de instância para controlar quantos produtos já estão ocupados.
Quando estiver cheio, impeça a adição de novos produtos.
O método calcularTotal faz o somatório dos produtos preço vezes quantidade de cada um dos produtos que estejam na cesta.
O método listarCesta mostra cada um dos produtos da cesta, indicando o tipo de produto (banana, maça, etc.), o preço unitário e a quantidade; no final mostre o valor total da cesta.
Perceba que a classe Produto é abstrata (está em itálico), bem como o método getPreco.
Faça um programa principal que ofereça um menu de opções ao usuário:
      *Colocar produto na cesta (usuário deve indicar o tipo e a quantidade);
      *Mostrar o conteúdo da cesta e, ao final, o valor total da cesta;
      *Limpar a cesta.
      
> Considere o modelo mostrado abaixo:

> ![Diagrama de Classes] (http://yuri.website/hortifruti.png "Diagrama de Classes")

**Links úteis:**

> [Como edita este arquivo README.md]( http://pichiliani.com.br/2015/09/como-fazer-um-bom-readme-para-o-seu-github/ "Como fazer um bom README para o seu git")

> [Apostila do Swing - Caelum]( http://www.caelum.com.br/apostila-java-testes-xml-design-patterns/ "Apostila Swing Caelum")
