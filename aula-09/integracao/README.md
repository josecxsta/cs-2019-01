## 📃 aula-09/integracao

Monitora uma pasta que quando recebe um arquivo JSON referente a uma Nota Fiscal serializa os dados dessa Nota Fiscal e gera um arquivo binário, comprimido em um arquivo .dat com o nome {sha-256}.dat, onde {sha-265} se refere a uma hash do binário seguindo o algorítmo sha-256.

### variável de ambiente

É necessário definir a variável de ambiente `NOTAS_FISCAIS` com o caminho da pasta em que ficarão as pastas: json, dat e erros.

O programa irá monitorar a pasta 'json' contida no diretório definido pela variável de ambiente NOTAS_FISCAIS. Os casos de sucesso terão o arquivo .dat salvos na pasta 'dat', os casos de falha terão o arquivo .json movidos para a pasta 'erros'.

### executável

O comando `mvn package -P integracao` gera um .jar executável na pasta /target.
O comando `mvn exec:java` executa o método main da classe indicada na configuração do plugin pertinente no arquivo pom.xml. Depende de `mvn compile`.
