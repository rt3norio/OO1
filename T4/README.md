[FuncExc] Crie um classe para a entidade Funcionário de um sistema de RH. Essa classe terá 3 atributos privados: matrícula – do tipo inteiro, somente leitura; nome – do tipo String, leitura e gravação – e salário– do tipo double, leitura e gravação.

Ao criar um objeto de Funcionário, a classe atribui automaticamente um novo código para o novo objeto. O atributo matrícula tem valor exclusivo para cada funcionário.

Ao tentar colocar um nome que tenha mais do que 40 caracteres, lançar a exceção do sistema IllegalArgumentException, indicando na mensagem o erro ocorrido.

Ao tentar indicar um salário menor que o salário mínimo (350 reais), lançar um exceção personalizada, herdando de IllegalArgumentException, chamada ViolacaoCltException, que recebe no construtor uma mensagem descritiva do erro ocorrido e o código do artigo da CLT que cita a proibição. Após a criação do objeto Funcionário, caso se tente colocar um salário 10% maior que o anterior, lançar a exceção AumentoAbsurdoException, que herda de RuntimeException.

Faça testes unitários que validem todas as regras dos objetos.
