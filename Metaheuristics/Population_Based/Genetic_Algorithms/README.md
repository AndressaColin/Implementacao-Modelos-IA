# 🧬 Algoritmos Genéticos

Esta pasta contém notebooks e códigos relacionados a **Algoritmos Genéticos (AGs)**, uma técnica de otimização baseada na teoria da evolução biológica de Darwin.


## 🔄 O que são Algoritmos Evolucionários?

Algoritmos Evolucionários (AE) são uma classe mais ampla de técnicas inspiradas em processos naturais de evolução e adaptação. Eles incluem os Algoritmos Genéticos, Programação Evolutiva, Estratégias Evolucionárias, entre outros. A ideia geral é iterar sobre populações de soluções, aplicando variação e seleção para melhorar resultados progressivamente.


## 💡 O que são Algoritmos Genéticos?

Algoritmos Genéticos são metaheurísticas inspiradas no processo de seleção natural. Eles usam operadores como **seleção**, **cruzamento (crossover)** e **mutação** para evoluir soluções para problemas complexos de otimização.

---

## 📝 Pseudocódigo Básico de Algoritmo Genético

```pseudo
1. Inicializar uma população de soluções aleatórias
2. Avaliar a aptidão (fitness) de cada indivíduo
3. Enquanto critério de parada não for atingido:
    3.1 Selecionar indivíduos para reprodução
    3.2 Aplicar crossover para gerar descendentes
    3.3 Aplicar mutação nos descendentes
    3.4 Avaliar aptidão dos descendentes
    3.5 Substituir a população atual pelos descendentes (ou misturar)
4. Retornar a melhor solução encontrada
```

---

## ⚙️ Requisitos

Certifique-se de ter instalado as bibliotecas:

```bash
pip install numpy matplotlib scikit-learn
