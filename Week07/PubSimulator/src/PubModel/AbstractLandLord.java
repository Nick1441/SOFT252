/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel;
import PubModel.Strategies.IDrinksStrategy;
/**
 *
 * @author ngclothier
 */
public abstract class AbstractLandLord {
    public abstract IDrinksStrategy selectStrategy(String drinksType);
}
