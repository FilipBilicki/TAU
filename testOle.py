from selenium import webdriver
import logging

from selenium.webdriver import Keys

logger = logging.getLogger('simple_example')
logger.setLevel(logging.INFO)
ch = logging.StreamHandler()
ch.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
ch.setFormatter(formatter)
logger.addHandler(ch)

driver = webdriver.Chrome(executable_path='C:\\Users\\Filip\\Desktop\\TAU\\chromedriver.exe')

logger.info('Przechodzę na stronę oleole')
driver.get('https://www.oleole.pl/')
logger.info("Akceptuje cookies")
temp = driver.find_element_by_id('onetrust-accept-btn-handler')
temp.click()
logger.info("klikam w wyszykiwarkę")
temp = driver.find_element_by_class_name('selenium-keyword-input')
temp.click()
logger.info("wpisuje fraze hp Spectre")
temp.send_keys('Hp Spectre')
temp.send_keys(Keys.ENTER)
logger.info("Znajduje produkt pierwszy")
temp = driver.find_elements_by_class_name('add-to-cart add-to-cart-big btn-type-ADD_TO_CART js-add-to-cart selenium-ADD_TO_CART-button')
temp.click()
logger.info("nie udało się znalezc elementu")
driver.close()
