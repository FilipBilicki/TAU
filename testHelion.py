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

logger.info('Przechodzę na helion')
driver.get('https://helion.pl/')
logger.info("klikam w wyszukiwarkę")
temp = driver.find_element_by_id('inputSearch')
temp.click()
logger.info("wpisuje fraze python")
temp.send_keys('python')
temp.send_keys(Keys.ENTER)
logger.info("Znajduje produkt 3 produkt na stronie")
temp = driver.find_element_by_class_name('pytho5-link')
temp.click()
logger.info("dodaje do koszyka produkt")
temp = driver.find_element_by_id('addToBasket_pytho5')
temp.click()
logger.info("zaznaczam do usunięcia checkbox")
temp = driver.find_element_by_class_name('input')
temp.click()
logger.info("nie udało się usunąć")
webdriver.close()
