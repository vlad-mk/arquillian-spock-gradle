/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.vlad.test

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

import org.jboss.arquillian.spock.ArquillianSputnik;
import org.jboss.shrinkwrap.api.Archive

import static org.junit.Assert.*
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import spock.lang.Specification


/**
 *
 * @author vlad
 */
@RunWith(ArquillianSputnik.class)
class SimpleSpec extends Specification {

    @Deployment
    public static Archive<?> "create deployment"() {
    	return ShrinkWrap.create(WebArchive.class, SimpleSpec.class.getSimpleName() + ".war")
            .addPackage(SimpleSpec.class.getPackage())
            //.addAsWebInfResource("partner.hbm.xml")
            .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }    
    
    
  def "let's try this!"() {
    expect:
	println "Complare ${i} and 2"
        Math.max(i, 2) == 2
    where:
         i << [1,2,3]
  }
        
}
