# Mini-Plan d’Implémentation & REFLEXION

## 1️⃣ Mini-plan d’implémentation

**Packages et classes :**  
- `com.jad` : toutes les classes principales (`Foo`, `Bar`, `Baz`, `Qux`, `Corge`, `Grault`).  
- `src/test/java/com/jad` : tous les tests unitaires (`FooTest`).

**Étapes de développement :**  
1. **Création des classes et attributs** : implémentation des champs et des constructeurs selon le diagramme UML.  
2. **Mise en place des relations** : relations unidirectionnelles ou bidirectionnelles selon UML.  
3. **Ajout des méthodes** : getters, setters et gestion du détachement des objets remplacés.  
4. **Exécution et correction après tests** : ajustement du code jusqu’à ce que tous les tests passent.  

## 2️⃣ Choix d’implémentation

- Chaque classe a une responsabilité bien définie pour respecter le principe de cohésion.  
- Les relations entre objets sont gérées via les setters et constructeurs, avec détachement automatique des anciennes références.  
- JUnit 5 est utilisé pour tester la création d’objets et la cohérence des relations.  
- Maven est utilisé pour compiler le projet et exécuter les tests.

## 3️⃣ Difficultés rencontrées

- Jamais codé en Java : installation de l'environnement de zéro.
- Interprétation correcte du diagramme UML (associations et cardinalités): j'avoue que sans aide, je n'aurai rien compris.  
- Gestion des relations bidirectionnelles et du détachement des objets.  
- Synchronisation entre code et tests unitaires.

## 4️⃣ Améliorations possibles

- Utilisation de collections (`List` ou `Set`) pour gérer les relations 1:N ou N:N.  
- Ajout de JavaDoc pour chaque classe et méthode.
