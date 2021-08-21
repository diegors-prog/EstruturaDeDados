function Pilha(tamanho) {
    let itens = []; //no javascript, por mais que indique o tamanho do array, ele sempre vai continuar adicionando
    const qtd = tamanho - 1;  //por isso uso a constante 'qtd' que recebe como parametro um valor, este valor servirá como flag apontando que este será o tamanho máximo do array  
    let topo = -1; 
    let ultimoValorAdd = null;    //uma flag para ficar apontando para o último item add, mesmo se for no final ou no inicio do array

    //função para validar se o array está cheio
    this.isFull = function() {
        if(topo>= qtd){
            return true;
        } else {
            return false;
        }
    }

    //função para retornar o último item do array
    this.peek = function() {
        return itens[itens.length - 1];
    }

    //função para validar se o próximo item a ser adicionado é mais pesado que o último item adicionado
    this.isBiggestElement = function(value) {
        if(value > ultimoValorAdd) {
            return true;
        }else {
            return false;
        }
    }

    //função para adicionar um item no final do array
    this.pushNoBraco = function(value) {
        if(ultimoValorAdd === null) {
            itens[topo + 1] = value;
            topo++;
            ultimoValorAdd = value;
            console.log(itens);
        }else {
            if(this.isFull() || this.isBiggestElement(value)) {
                console.log(`Array cheio ou elemento a ser adicionado é maior que o último item adicionado!`);
            }else {
                itens[topo + 1] = value;
                topo++;
                ultimoValorAdd = value;
                console.log(itens);
            }
        }
    }

    //função para adicionar um item no inicio do array
    this.unshiftNoBraco = function(value) {
        if(ultimoValorAdd === null) {
            itens[0] = value;
            topo++;
            ultimoValorAdd = value;
            console.log(itens);
       }else {
            if(this.isFull() || this.isBiggestElement(value)) {
                console.log(`Array cheio`);
            }else {
                for(let i = 0; i >= 0; i--) {
                    itens[i + 1] = itens[i];
                }
                itens[0] = value;
                topo++;
                ultimoValorAdd = value;
                console.log(itens);
            }
       }
        
    }

    //função para validar se o array está vazio
    this.isEmpty = function() {
        if(topo === -1) {
            return true;
        } else {
            return false;
        }
    }

    //função para remover um item do inicio do array
    this.shiftNoBraco = function() {
        if(this.isEmpty()) {
            console.log(`Array vazio!`);
        }else {
            for(let i = 0; i < itens.length; i++) {
                itens[i] = itens[i + 1];
            }
            itens.length = itens.length - 1;
            topo--;
        }
    }

    //função para remover um item do final do array
    this.popNobraco = function() {
        if(this.isEmpty()) {
            console.log(`Array vazio!`);
        }else {
            itens.length = itens.length - 1;
            topo--;
        }
    }

    //função para mostrar os itens contidos no array
    this.print = function() {
        itens.forEach((item) => {
            console.log(item);
        })
    }
}

let pilha = new Pilha(10);

pilha.pushNoBraco(10);
pilha.pushNoBraco(8);
pilha.pushNoBraco(6);
pilha.pushNoBraco(12);
pilha.pushNoBraco(4);
pilha.unshiftNoBraco(3);
pilha.unshiftNoBraco(7);
pilha.shiftNoBraco();
pilha.popNobraco();

pilha.print();